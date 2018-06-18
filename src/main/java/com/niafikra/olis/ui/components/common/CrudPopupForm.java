package com.niafikra.olis.ui.components.common;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcons;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class CrudPopupForm extends VerticalLayout {
    protected Button cancel = new Button(new Icon(VaadinIcons.CLOSE));

    public CrudPopupForm(String title,
                         FormLayout formContents,
                         HorizontalLayout actionButtons) {
        cancel.setText("Cancel");
        FormLayout formFields =
                new FormLayout(formContents);
        HorizontalLayout buttons =
                new HorizontalLayout(actionButtons, cancel);
        add(new H2(title), formFields, buttons);
    }

//    protected Dialog cancelContols(Dialog parentDialog) {
//        parentDialog = new Dialog();
//        parentDialog.setCloseOnEsc(false);
//        parentDialog.setCloseOnOutsideClick(false);
//        Dialog finalParentDialog = parentDialog;
//        cancel.addClickListener(e -> {
//            finalParentDialog.close();
//        });
//        return finalParentDialog;
//    }
    //    protected H2 formTitle;
//    private Object parentView;
//    private Button[] actionButtons;
//    private Component[] formComponents;
//
//    private VerticalLayout dialogContents;
//    private Button cancel = new Button(new Icon(VaadinIcons.CLOSE));
//
//
//    public CrudPopupForm(Object parentView) {
//        this.parentView = parentView;
//        buildUI();
//    }
//
//    protected void buildUI() {
//        setCloseOnEsc(false);
//        setCloseOnOutsideClick(false);
//
//        cancel.addClickListener(e -> {
//            close();
//        });
//
//        setActionButtons(cancel);
//        FormLayout formFields =
//                new FormLayout(getFormComponents());
//        HorizontalLayout actionButtons =
//                new HorizontalLayout(getActionButtons());
//        dialogContents = new VerticalLayout(getFormTitle(),
//                formFields,
//                actionButtons);
//        add(dialogContents);
//
//    }
//
//    protected Object getParentView() {
//        return parentView;
//    }
//
//    protected void setParentView(Object parentView) {
//        this.parentView = parentView;
//    }
//
//    protected H2 getFormTitle() {
//        return formTitle;
//    }
//
//    protected void setFormTitle(H2 formTitle) {
//        this.formTitle = formTitle;
//    }
//
//    protected Button[] getActionButtons() {
//        return actionButtons;
//    }
//
//    protected void setActionButtons(Button... actionButtons) {
//        this.actionButtons = actionButtons;
//    }
//
//    protected Component[] getFormComponents() {
//        return formComponents;
//    }
//
//    protected void setFormComponents(Component... formComponents) {
//        this.formComponents = formComponents;
//    }

}
