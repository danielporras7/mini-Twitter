package edu.cpp.cs585.mini_twitter_app;



public interface Subject {

    public void attach(Observer observer);
    public void notifyObservers();

}
