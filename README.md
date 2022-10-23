# oldSchool
var engTexts = Array.from(document.querySelectorAll('.currency-sub-container.bank-selected .currency-table-container table.currency-table .uk-flex-middle .uk-text-bold.uk-text-uppercase')).map(el => el.textContent);
var monTexts = Array.from(document.querySelectorAll('.currency-sub-container.bank-selected .currency-table-container table.currency-table .uk-flex-middle .text-12.cname')).map(el => el.textContent);
var rates = Array.from(document.querySelectorAll('.currency-sub-container.bank-selected .currency-table-container table.currency-table td div.text-black')).map(el => el.textContent);

var exchangeRates = [].concat(engTexts).map((text, index) => ({
    eng: text,
    mon: monTexts[index],
    rate: rates[index] 
}));  

const newHandle = await window.showSaveFilePicker();
const writableStream = await newHandle.createWritable();

// Save file to exchange.json - .json geed extension bichehee martvaa
await writableStream.write(JSON.stringify(exchangeRates));
await writableStream.close();

//gogoexchangetatah
