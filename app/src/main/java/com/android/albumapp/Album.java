package com.android.albumapp;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Ziyang Liu
 * @author Hongpeng Zhang
 */
public class Album implements java.io.Serializable
{
    private String albumName;
    private ArrayList<Photo> photos;

    public Album(String albumName){
        this.albumName = albumName;
        this.photos = new ArrayList<Photo>();
    }


    public void addPhoto(Photo photo)
    {
        if (!photos.contains(photo) && photo != null)
            photos.add(photo);
    }

    public boolean deletePhoto(Photo photo)
    {
        if(photos.contains(photo))
        {
            photos.remove(photo);
            return true;
        }
        else
            return false;
    }

    public String getAlbumName(){
        return albumName;
    }

    public ArrayList<Photo> getPhotos()
    {
        return photos;
    }

    public void setAlbumName(String albumName){
        this.albumName = albumName;
    }

    public String toString(){
        return albumName;
    }

    private void writeObject(java.io.ObjectOutputStream stream)
            throws IOException
    {
        stream.writeObject(albumName);
        stream.writeObject(photos);
    }

    private void readObject(java.io.ObjectInputStream stream)
            throws IOException, ClassNotFoundException
    {
        albumName = (String) stream.readObject();
        photos = (ArrayList<Photo>)stream.readObject();
    }
}
