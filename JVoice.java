package org.curie;

//importing packages from Microsoft Azure speech API

import com.microsoft.cognitiveservices.speech.*;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class JVoice implements JavaVoice {

    //initiating fields
    private static final String speechKey = " "; #enter your api key
    private static final String speechRegion = " "; #enter your api region

    public void speak(String text) {

        //creating speech configuration by passing subscription key and region
        SpeechConfig speechConfig = SpeechConfig.fromSubscription(speechKey, speechRegion);

        //set voice of speech configuration
        speechConfig.setSpeechSynthesisVoiceName("en-IN-NeerjaNeural");

        //create instance of SpeechSynthesizer class
        SpeechSynthesizer speechSynthesizer = new SpeechSynthesizer(speechConfig);

        //check if text is empty
        if (text.isEmpty()) {
            return;
        }

        //else execute speech synthesis on text
        //convert text into speech
        else {
            speechSynthesizer.SpeakTextAsync(text);
        }
    }

    public String listen() throws ExecutionException, InterruptedException {

        //creating speech configuration by passing subscription key and region
        SpeechConfig speechConfig = SpeechConfig.fromSubscription(speechKey, speechRegion);

        //set speech recognition language
        speechConfig.setSpeechRecognitionLanguage("en-IN");

        //create an AudioConfig object representing the default microphone in the system
        AudioConfig audioConfig = AudioConfig.fromDefaultMicrophoneInput();

        //create instance of SpeechRecognizer class
        SpeechRecognizer speechrecognizer = new SpeechRecognizer(speechConfig, audioConfig);

        //start speech recognition
        //return after single utterance is recognised
        //store the result
        //Future is an interface
        Future<SpeechRecognitionResult> task = speechrecognizer.recognizeOnceAsync();

        //get the result of speech recognition
        SpeechRecognitionResult speechRecognitionResult = task.get();

        //check if speech is recognized
        //store the result text as string
        String text;

        if (speechRecognitionResult.getReason() == ResultReason.RecognizedSpeech) {
            text = speechRecognitionResult.getText();
            return text;
        }

        else {
            System.out.println("An ERROR occurred!");
            return null;
        }
    }

}
