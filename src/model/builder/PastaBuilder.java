package model.builder;

import java.util.Arrays;
import java.util.List;

public class PastaBuilder {


    protected Size size;
    protected List<String> toppings;
    protected List<String>  sauces;
    protected boolean cheese;
    protected boolean tomato;

    public PastaBuilder(Size size) {
        this.size = size;
    }
    public PastaBuilder withToppings(String toppings){
        this.toppings = Arrays.asList(toppings);
        return this;
    }
    public PastaBuilder withSauces(String sauces){
        this.sauces = Arrays.asList(sauces);
        return this;
    }
    public PastaBuilder withCheese(){
        this.cheese = cheese;
        return this;
    }
    public PastaBuilder withTomato(){
        this.tomato = tomato;
        return this;
    }
    public Pasta now (){
        return new Pasta(toppings,sauces,size, cheese,tomato);
    }
}
