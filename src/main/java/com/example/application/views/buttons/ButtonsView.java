package com.example.application.views.listOfButtons;

import com.example.application.views.MainView;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Buttons")
@Route(value="Buttons", layout = MainView.class)
public class ButtonsView extends VerticalLayout {

    Text incrementValue = new Text(String.valueOf(0));

    public ButtonsView() {
        addClassName("buttons-view");
        setSizeFull();
        add(getToolbar());
    }


    private HorizontalLayout getToolbar() {
        Button incrementButton = new Button("Add Increment");
        HorizontalLayout toolbar = new HorizontalLayout(incrementValue, incrementButton);
        toolbar.addClassName("Buttontoolbar");
        return toolbar;
    }
}
