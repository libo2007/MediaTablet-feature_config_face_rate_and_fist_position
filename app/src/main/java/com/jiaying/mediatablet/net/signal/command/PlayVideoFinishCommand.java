package com.jiaying.mediatablet.net.signal.command;

import com.jiaying.mediatablet.net.signal.receiver.Receiver;

/**
 * Created by hipil on 2016/9/17.
 */
public class PlayVideoFinishCommand extends Command{
    private Receiver receiver;

    public PlayVideoFinishCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public boolean execute() {
        this.receiver.work();
        return false;
    }
}
