package cbnu.capstone.tripwithme.mapper.tourlist;

import cbnu.capstone.tripwithme.dto.tourlist.TourlistDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TourlistMapper {
    List<TourlistDTO> getTourlist(String region);
}