package album.dao;

import album.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.function.Predicate;

public class AlbumImpl implements Album {
    private Photo[] photos;
    private int size;

    public AlbumImpl(int capacity) {
        this.photos = new Photo[capacity];
    }

    @Override
    public boolean addPhoto(Photo photo) {
        if (photos.length > size && !isPresent(photo)) {
            photos[size] = photo;
            size++;
            return true;
        } else
            return false;
    }

    private boolean isPresent(Photo photo) {
        if (photo != null) {
            for (Photo p : photos) {
                if (photo.equals(p)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        Photo photo = getPhotoFromAlbum(photoId, albumId);
        if (isPresent(photo)) {
            for (int i = 0, j = 0; i < size; i++) {
                if (photo.equals(photos[i])) {
                    size--;
                    photos[i] = null;
                } else {
                    photos[j] = photos[i];
                    j++;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photo = getPhotoFromAlbum(photoId, albumId);
        if (isPresent(photo)) {
            for (Photo p : photos) {
                if (p.equals(photo)) {
                    p.setUrl(url);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        for (Photo p : photos) {
            if (p != null && p.getPhotoId() == photoId && p.getAlbumId() == albumId) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        return findPhotoByPredicate(photo -> photo.getAlbumId() == albumId);
    }

    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return findPhotoByPredicate(p -> p
                .getDate().toLocalDate().isAfter(dateFrom)
                && p.getDate().toLocalDate().isBefore(dateTo));
    }

    @Override
    public int size() {
        return size;
    }

    private Photo[] findPhotoByPredicate(Predicate<Photo> predicate) {
        Photo[] photos = new Photo[this.photos.length];

        int j = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(this.photos[i])) {
                photos[j] = this.photos[i];
                j++;
            }
        }
        photos = Arrays.copyOfRange(photos, 0, j);
        Arrays.sort(photos);
        return photos;
    }
}