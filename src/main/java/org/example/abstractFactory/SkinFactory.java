package org.example.abstractFactory;

import org.example.abstractFactory.entity.Button;
import org.example.abstractFactory.entity.ComboBox;
import org.example.abstractFactory.entity.TextField;

public interface SkinFactory {
    Button createButton();
    TextField createTextField();

    ComboBox createComboBox();
}
