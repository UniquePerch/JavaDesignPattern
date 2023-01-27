package org.behavioralPattern.mediator;

public abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void update();

    public void changed(){ //转发调用
        mediator.componentChanged(this);
    }
}
