package album.test;

import album.dao.Album;
import album.dao.AlbumImpl;
import album.model.Photo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {
    Album albums;

    @BeforeEach
    void setUp() {
        albums = new AlbumImpl(6);
        LocalDateTime dateTime = LocalDateTime.of(2023, 7, 7, 20, 20, 12);
        albums.addPhoto(new Photo(1, 1, "07-07-2023", "ftp//c:/photos", dateTime));

        dateTime = LocalDateTime.of(2023, 7, 6, 2, 25, 2);
        albums.addPhoto(new Photo(1, 2, "06-07-2023", "ftp//c:/photos", dateTime));

        dateTime = LocalDateTime.of(2023, 7, 5, 17, 43, 59);
        albums.addPhoto(new Photo(1, 3, "05-07-2023", "ftp//c:/photos", dateTime));

        dateTime = LocalDateTime.of(2023, 7, 4, 21, 34, 48);
        albums.addPhoto(new Photo(2, 4, "04-07-2023", "ftp//c:/photos", dateTime));

        dateTime = LocalDateTime.of(2023, 3, 3, 22, 56, 32);
        albums.addPhoto(new Photo(2, 5, "03-03-2023", "ftp//c:/photos", dateTime));

        for (Photo p : albums.getAllPhotoFromAlbum(1)) {
            System.out.println(p);
        }
        for (Photo p : albums.getAllPhotoFromAlbum(2)) {
            System.out.println(p);
        }
    }

    @Test
    void testAddPhoto() {
        LocalDateTime dateTime = LocalDateTime.of(2023, 9, 18, 3, 22, 45);
        Photo photo = new Photo(2, 6, "03-03-2023", "ftp//c:/photos", dateTime);

        assertTrue(albums.addPhoto(photo));
        assertEquals(photo, albums.getPhotoFromAlbum(6, 2));

        assertFalse(albums.addPhoto(photo));

        assertFalse(albums.addPhoto(null));

        dateTime = LocalDateTime.now().minusDays(3);
        photo = new Photo(2, 7, "28-02-2023", "ftp//c:/photos", dateTime);
        assertFalse(albums.addPhoto(photo));


    }

    @Test
    void testRemovePhoto() {

        int expected = albums.size();
        assertTrue(albums.removePhoto(5, 2));
        int actual = albums.size();
        assertEquals(expected - 1, actual);
        assertFalse(albums.removePhoto(6, 8));
        assertFalse(albums.removePhoto(5, 2));

    }

    @Test
    void testUpdatePhoto() {
        LocalDateTime dateTime = LocalDateTime.of(2023, 3, 3, 22, 56, 32);
        Photo expected = new Photo(2, 5, "03-03-2023", "ftp//c:/photos/family", dateTime);
        albums.updatePhoto(5, 2, "ftp//c:/photos/family");
        assertEquals(expected, albums.getPhotoFromAlbum(5, 2));
    }

    @Test
    void testGetPhotoFromAlbum() {
        LocalDateTime dateTime = LocalDateTime.of(2023, 3, 3, 22, 56, 32);
        Photo expected = new Photo(2, 5, "03-03-2023", "ftp//c:/photos", dateTime);
        Photo actual = albums.getPhotoFromAlbum(5, 2);
        assertEquals(expected, actual);
    }

    @Test
    void testGetAllPhotosFromAlbum() {
        Photo[] expected = {new Photo(2, 5, "03-03-2023", "ftp//c:/photos",
                LocalDateTime.of(2023, 3, 3, 22, 56, 32))
                , new Photo(2, 4, "04-07-2023", "ftp//c:/photos",
                LocalDateTime.of(2023, 7, 4, 21, 34, 48))};
        Photo[] actual = albums.getAllPhotoFromAlbum(2);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGetPhotoBetweenDate() {
        Photo[] expected = {new Photo(2, 5, "03-03-2023", "ftp//c:/photos",
                LocalDateTime.of(2023, 3, 3, 22, 56, 32))
                , new Photo(2, 4, "04-07-2023", "ftp//c:/photos",
                LocalDateTime.of(2023, 7, 4, 21, 34, 48))};
        LocalDate after = LocalDate.of(2023, 3, 2);
        LocalDate before = LocalDate.of(2023, 7, 5);
        Photo[] actual = albums.getPhotoBetweenDate(after, before);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSize() {
        int expected = 5;
        int actual = albums.size();
        assertEquals(expected, actual);
    }
}