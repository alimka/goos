package auctionsniper;

public interface AuctionEventListener {
    enum PriceSource {
        FromSnipper, FromOtherBidder;
    }

    public void auctionClosed();

    public void currentPrice(int price, int increment, PriceSource priceSource);
}
