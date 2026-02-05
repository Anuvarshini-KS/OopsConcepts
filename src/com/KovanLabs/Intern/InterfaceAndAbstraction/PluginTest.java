package com.KovanLabs.Intern.InterfaceAndAbstraction;
interface Plugin
{
    void execute();
}
class CoreSystem
{

    public void runPlugin(Plugin[] plugin)
    {
        for(Plugin p : plugin)
        {
            p.execute();
        }
    }
}
public class PluginTest {
    public static void main(String[] args)
    {
        Plugin[] plugin = new Plugin[]
                {
                        new Plugin() {
                            @Override
                            public void execute() {
                                System.out.println("Login Plugin executed");
                            }
                        },
                        new Plugin() {
                            @Override
                            public void execute() {
                                System.out.println("Email Plugin executed");
                            }
                        },
                        new Plugin() {
                            @Override
                            public void execute() {
                                System.out.println("Authentication Plugin executed");
                            }
                        },
                        new Plugin() {
                            @Override
                            public void execute() {
                                System.out.println("Logout Plugin executed");
                            }
                        }
                };
        CoreSystem system = new CoreSystem();
        system.runPlugin(plugin);
    }

}
