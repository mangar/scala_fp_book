package example

case class Stock(code: String, name: String)
case class StockPrice(val stock: Stock, price: Number)

case class StockOption(val stock: Stock, val code: String, val strike: Number)

// val stock = Stock("1", "Description")

object ScrapStock {

  def scrapStock(stock: Stock): StockPrice = {
    println(">> Scrapping stock: " + stock.code)

    StockPrice(stock, 77.4)
  }

}
