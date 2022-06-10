package cbnu.capstone.tripwithme.controller.tourlist;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class TourList
{

}