public enum Enumeration {
noel("bitchass","b"),
hello("stupid","c"),
WhatUpp("Fucker","a"),
noel2("italian","Whatup"),
noel3("fucker", "cute"),
noel4("Aaron","hot");


private final String desc;
private final String ch;

Enumeration(String description,String character){
    desc = description;
    ch = character;
}

public String getDesc(){return desc;}
public String getChar(){return ch;}

}
