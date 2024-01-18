package aa.bb.demoroom;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Animal.class}, version = 1)
public abstract  class AnimalsDatabase
extends RoomDatabase {
    public abstract AnimalDao animalDao();
}
