package cbnu.capstone.tripwithme.service.tourlist;

import cbnu.capstone.tripwithme.dto.tourlist.TourlistDTO;
import cbnu.capstone.tripwithme.mapper.tourlist.TourlistMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TourlistServiceImp implements TourlistService{
    private final TourlistMapper tourlistMapper;

    @Override
    public List<TourlistDTO> getTourlist(String region){ return tourlistMapper.getTourlist(region);}
}