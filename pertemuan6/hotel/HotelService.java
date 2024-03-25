package pertemuan6.hotel;
import java.util.ArrayList;
import java.util.List;
public class HotelService {

    private List<Hotel> hotelList;

    public HotelService() {
        hotelList = new ArrayList<>();
    }

    public void tambah(Hotel hotel) {
        hotelList.add(hotel);
    }

    public void tampilAll() {
        for (Hotel hotel : hotelList) {
            System.out.println(hotel);
        }
    }

    public void bubbleSortHarga() {
        for (int i = 0; i < hotelList.size() - 1; i++) {
            for (int j = 0; j < hotelList.size() - i - 1; j++) {
                if (hotelList.get(j).getHarga() > hotelList.get(j + 1).getHarga()) {
                    Hotel temp = hotelList.get(j);
                    hotelList.set(j, hotelList.get(j + 1));
                    hotelList.set(j + 1, temp);
                }
            }
        }
    }

    public void selectionSortBintang() {
        for (int i = 0; i < hotelList.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < hotelList.size(); j++) {
                if (hotelList.get(j).getBintang() > hotelList.get(minIndex).getBintang()) {
                    minIndex = j;
                }
            }
            Hotel temp = hotelList.get(minIndex);
            hotelList.set(minIndex, hotelList.get(i));
            hotelList.set(i, temp);
        }
    }
}
