package org.creationalPattern.abstractFactory;

import org.creationalPattern.abstractFactory.entity.Button;
import org.creationalPattern.abstractFactory.entity.ComboBox;
import org.creationalPattern.abstractFactory.entity.TextField;

public interface SkinFactory {
    Button createButton();
    TextField createTextField();

    ComboBox createComboBox();
}
