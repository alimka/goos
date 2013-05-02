package auctionsniper;

public class AuctionSniper implements AuctionEventListener {
    private final SniperListener sniperListener;
    private final Auction auction;

    public AuctionSniper(SniperListener sniperListener, Auction auction) {
        this.sniperListener = sniperListener;
        this.auction = auction;
    }

    @Override
    public void auctionClosed() {
        sniperListener.sniperLost();
    }

    @Override
    public void currentPrice(Integer currentPrice, Integer increment) {
        auction.bid(currentPrice + increment);
        sniperListener.sniperBidding();
    }
}
