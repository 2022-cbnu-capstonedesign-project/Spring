package cbnu.capstone.tripwithme.service.tourlist;


import cbnu.capstone.tripwithme.dto.tourlist.TourlistDTO;

import java.util.List;

public interface TourlistService{
    List<TourlistDTO> getTourlist(String region);
}