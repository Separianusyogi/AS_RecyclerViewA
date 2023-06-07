package com.separianusyogi202102272.as_recyclerviewa;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class NegaraViewHolder extends RecyclerView.ViewHolder
{
    public ImageView _imageView1;
    public TextView _deskripsiTextView;
    public TextView _namaTextView;

    public NegaraViewHolder(@NonNull View itemView) {
        super(itemView);

        _imageView1 =(ImageView) itemView.findViewById(R.id.imageView1);
        _namaTextView =(TextView) itemView.findViewById(R.id.NamaTextView);
        _deskripsiTextView =(TextView) itemView.findViewById(R.id.DeskripsiTextView);
    }
}
