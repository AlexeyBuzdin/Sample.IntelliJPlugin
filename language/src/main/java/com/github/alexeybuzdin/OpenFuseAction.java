package com.github.alexeybuzdin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class OpenFuseAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        try {


        } catch (Exception e) {
            Messages.showDialog(e.getMessage(), "Failed to Open Fuse", new String[]{"OK"}, -1, null);
        }

    }
}
