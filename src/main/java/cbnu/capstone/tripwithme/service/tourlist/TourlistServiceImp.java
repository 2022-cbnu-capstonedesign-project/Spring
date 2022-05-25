

@Service
@RequiredArgsConstructor
public class TourlistServiceImp implements TourlistService{
    private final TourlistMapper tourlistMapper;

    @Override
    public List<TourlistDTO> getTourlist(String region){ return tourlistMapper.getTourlist(region);}
}