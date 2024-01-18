package aa.bb.demoroom;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

//@Entity(tableName = "Animal_Table")
@Entity
public class Animal {
    @NonNull
    @PrimaryKey
    public String code;
   // @ColumnInfo(name = "nomA")
    public String nom;
    @Override
    public String toString() {
        return "Animal{" +
                "code='" + code + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
    public Animal(String code,String nom) {
        this.code=code;
        this.nom = nom;
    }
}

