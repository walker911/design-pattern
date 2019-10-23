package com.walker.design.zen.facade;

/**
 * @author walker
 * @date 2019/3/26
 */
public class ModernPostOffice {

    private ILetterProcess letterProcess = new LetterProcessImpl();

    private Police police = new Police();

    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        police.checkLetter(letterProcess);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
