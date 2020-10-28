package com.e.razkacounter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<Integer> text;
    int count=0;

    public MainViewModel(){
        text = new MutableLiveData<>();
        text.setValue(0);
    }

    public LiveData<Integer> getText(){
        return text;
    }

    public void add(){
        text.setValue(count++);
    }

    public void min(){
        text.setValue(count--);
    }

    public void reset(){
        text.setValue(count);
    }
    // TODO: Implement the ViewModel
}