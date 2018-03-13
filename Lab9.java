package com.tasks5.command;

class EchoCommand implements Command
{
    private String InComand;
    public EchoCommand(String text)
    {
        this.InComand = text;
    }
    public void execute()
    {
        System.out.println(InComand);
    }
}

class HelpCommand implements Command
{
    public void execute()
    {
        System.out.println("Help executed");
    }
}

class DateCommand implements Command
{
    public void execute()
    {
        System.out.println(System.currentTimeMillis());
    }
}

class ExitCommand implements Command
{
    public void execute()
    {
        System.out.println("Goodbye!");
    }
}

class Error implements Command
{
    public Error(){};
    public void execute()
    {
        System.out.println("Error");
    }
}

class InputedCommand
{
    private String _command_txt[];
    public Command _command;
    public InputedCommand(String _command_txt[])
    {
        if(_command_txt == null) {
            this._command = new Error();
            return;
        }
        String outText = new String();
        this._command_txt = _command_txt;
        if(this._command_txt.length != 0) {
            if (this._command_txt[0] == "echo") {
                if (this._command_txt.length == 2) {
                    outText = this._command_txt[1];
                    this._command = new EchoCommand(outText);
                    return;
                }
                else {
                    this._command = new Error();
                    return;
                }
            }
            if ((this._command_txt[0] == "exit") && (this._command_txt.length == 1)) {
                this._command = new ExitCommand();
                return;
            }
            if ((this._command_txt[0] == "date") && (this._command_txt[1] == "now")) {
                this._command = new DateCommand();
                return;
            }
            if ((this._command_txt[0] == "help") && (this._command_txt.length == 1)) {
                this._command = new HelpCommand();
                return;
            }
        }
        this._command = new Error();
    }
}

public class Application {
    public static void main(String[] args){
        String[] input = args;
        InputedCommand myCommand = new InputedCommand(input);
        myCommand._command.execute();
    }
}