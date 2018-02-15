package com.example.sharingapp;
import android.content.Context;

/**
 * Command to delete contact
 */
public class DeleteContactCommand extends Command {

    private ContactList contact_list;
    private Contact old_contact;
    private Context context;

    public DeleteContactCommand(ContactList contact_list, Contact old_contact, Context context) {
        this.contact_list = contact_list;
        this.old_contact = old_contact;
        this.context = context;
    }

    public void execute() {
        contact_list.deleteContact(old_contact);
        setIsExecuted(contact_list.saveContacts(context));
    }
}