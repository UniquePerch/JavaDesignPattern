package org.example.abstractFactory;

import org.example.abstractFactory.entity.*;

public class SummerSkinFactory implements SkinFactory{

    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummberComboBox();
    }
}
