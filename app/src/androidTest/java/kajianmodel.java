/**
 * Created by Inge on 16/05/2018.
 */

public class kajianmodel {
    private int kajianImage;
    private String ustadName;
    private String masjidName;
    private String masjidLokasi;

    public kajianmodel(int kajianImage, String ustadName, String masjidName, String masjidLokasi) {
        this.kajianImage = kajianImage;
        this.ustadName = ustadName;
        this.masjidName = masjidName;
        this.masjidLokasi = masjidLokasi;
    }

    public kajianmodel() {
    }

    public int getKajianImage() {
        return kajianImage;
    }

    public void setKajianImage(int kajianImage) {
        this.kajianImage = kajianImage;
    }

    public String getUstadName() {
        return ustadName;
    }

    public void setUstadName(String ustadName) {
        this.ustadName = ustadName;
    }

    public String getMasjidName() {
        return masjidName;
    }

    public void setMasjidName(String masjidName) {
        this.masjidName = masjidName;
    }


    public String getMasjidLokasi() {
        return masjidLokasi;
    }

    public void setMasjidLokasi(String masjidLokasi) {
        this.masjidLokasi = masjidLokasi;
    }


}
