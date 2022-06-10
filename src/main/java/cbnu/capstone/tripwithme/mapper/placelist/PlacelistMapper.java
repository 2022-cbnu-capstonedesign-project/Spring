package cbnu.capstone.tripwithme.mapper.placelist;

import cbnu.capstone.tripwithme.dto.tourlist.PlacelistDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlacelistMapper {
    List<PlacelistDTO> getPlacelist();
    List<PlacelistDTO> getPlacelistFilter(String region);
}