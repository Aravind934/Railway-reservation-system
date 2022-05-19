package options;

import java.util.ArrayList;

public class OptionsBuilder {
    private static  ArrayList<Options> options = new ArrayList<Options>();
    private static OptionsBuilder optionsBuilder;
    private OptionsBuilder() {
        options.add(new Book());
        options.add(new Cancel());
        options.add(new PrintBookedTickets());
        options.add(new PrintAvailableTickets());
    }
    public static OptionsBuilder getInstance(){
        if(optionsBuilder==null) optionsBuilder = new OptionsBuilder();
        return optionsBuilder;
    }
    public void runOption(int option){
        options.get(option).run();
    }
}
