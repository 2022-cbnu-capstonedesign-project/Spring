package cbnu.capstone.tripwithme.controller.placelist;

import cbnu.capstone.tripwithme.dto.tourlist.PlacelistDTO;
import cbnu.capstone.tripwithme.service.placelist.PlacelistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/placelist")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class PlaceList
{

    private final PlacelistService placelistService;

    @GetMapping("/")
    public List<PlacelistDTO> getTourList(HttpServletRequest request){
        return placelistService.getPlacelist();
    }

    @GetMapping("/filter")
    public List<PlacelistDTO> getTourListFilter(HttpServletRequest request){
        String region = request.getParameter("region");
        return  placelistService.getPlacelistFilter(region);
    }
}