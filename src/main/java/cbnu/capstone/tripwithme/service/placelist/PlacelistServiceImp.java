package cbnu.capstone.tripwithme.service.placelist;

import cbnu.capstone.tripwithme.dto.tourlist.PlacelistDTO;
import cbnu.capstone.tripwithme.mapper.placelist.PlacelistMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlacelistServiceImp implements PlacelistService {
    private final PlacelistMapper placelistMapper;

    @Override
    public List<PlacelistDTO> getPlacelist(){ return placelistMapper.getPlacelist();}

    @Override
    public List<PlacelistDTO> getPlacelistFilter(String region){ return placelistMapper.getPlacelistFilter(region);}
}