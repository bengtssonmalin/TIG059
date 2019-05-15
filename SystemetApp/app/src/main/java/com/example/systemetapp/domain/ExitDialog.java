package com.example.systemetapp.domain;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.app.AlertDialog;

public class ExitDialog extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("VARNING")
            .setMessage("Denna webbsida innehåller information om alkoholdrycker. För inköp och besök på denna webbplats måste du vara 20 år eller äldre.")
            .setPositiveButton("Avsluta app",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    System.exit(0);
                }
            });
            return builder.create();
    }
}
