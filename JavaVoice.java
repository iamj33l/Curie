package org.curie;

interface JavaVoice {
    //synthesis string into speech
    void speak(String text);

    //recognize speech into String
    String listen() throws Exception;
}