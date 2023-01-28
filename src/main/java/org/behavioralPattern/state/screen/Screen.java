package org.behavioralPattern.state.screen;

public class Screen {
    private ScreenState normalState,largerState,largestState,currentState;

    public Screen(){
        normalState = new NormalState();
        largerState = new LargerState();
        largestState = new LargestState();
        currentState = normalState;
        currentState.display();
    }

    public void setState(ScreenState state){
        this.currentState = state;
    }

    public void click(){
        if(this.currentState == normalState){
            this.setState(largerState);
            this.currentState.display();
        }
        else if(this.currentState == largerState){
            this.setState(largestState);
            this.currentState.display();
        }
        else{
            this.setState(normalState);
            this.currentState.display();
        }
    }
}
