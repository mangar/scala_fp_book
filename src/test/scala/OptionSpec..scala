import org.scalatest.funsuite._

import example.Stock
import example.StockOption
import example.ScrapStock

class OptionSpec extends AnyFunSuite {

  //
  //
  test("Stock #1 ") {
    val stock = Stock("VALE3", "Vale do Rio Doce")
    assert(stock.code == "VALE3")
  }

  //
  //
  test("StockOptions #1 ") {
    val stockVale   = Stock("VALE3", "Vale do Rio Doce")
    val stockOption = StockOption(stockVale, "VALEP77", 77.00)

    assert(stockOption.stock.code == "VALE3")
    assert(stockOption.code == "VALEP77")

  }

  //
  //
  test("Scrap Stock #1 ") {
    val stockVale  = Stock("VALE3", "Vale do Rio Doce")
    val stockPrice = ScrapStock.scrapStock(stockVale)

    assert(stockPrice.stock.code == stockVale.code)

  }

}
