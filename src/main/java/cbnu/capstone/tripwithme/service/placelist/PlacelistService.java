package cbnu.capstone.tripwithme.service.placelist;


import cbnu.capstone.tripwithme.dto.tourlist.PlacelistDTO;

import java.util.List;

public interface PlacelistService {
    List<PlacelistDTO> getPlacelist();
    List<PlacelistDTO> getPlacelistFilter(String region);

}