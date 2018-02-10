function View(common) {
    this.common = common;
}
<<<<<<< HEAD

View.prototype.addNewArticle = function (article, callback1 = ()=>{}, callback2 = ()=>{}, rowClickListener = ()=>{}) {
    var tableBody = this.common.select("table > tbody");
    if ( tableBody ) {
        var newRow = tableBody.insertRow(0);
        var newCell = newRow.insertCell(0);
        newCell.innerText = article.number;
        newCell = newRow.insertCell(1);
        newCell.innerText = article.subject;
        newCell = newRow.insertCell(2);
        newCell.dataset.id = article.writerId;
        newCell.innerText = article.writer;
        newCell = newRow.insertCell(3);
        newCell.innerText = article.read;


            callback1();

            callback2();



            rowClickListener(newRow);

    }
};

View.prototype.addReverseNewArticle = function(article, callback1 = ()=>{}, callback2 = ()=>{}, rowClickListener = ()=>{}) {
    var tableBody = this.common.select("table > tbody");
    if ( tableBody  ) {
        var newRow = tableBody.insertRow(tableBody.rows.length);
        var newCell = newRow.insertCell(0);
        newCell.innerText = article.number;
        newCell = newRow.insertCell(1);
        newCell.innerText = article.subject;
        newCell = newRow.insertCell(2);
        newCell.dataset.id = article.writerId;
        newCell.innerText = article.writer;
        newCell = newRow.insertCell(3);
        newCell.innerText = article.read;


            callback1();

            callback2();



            rowClickListener(newRow);

    }
};

View.prototype.removeDetailRows = function (tbody) {
    for ( var index in tbody.rows ) {
        if ( tbody.rows[index].className == "detail" ) {
            tbody.deleteRow(index);
        }
    }
};

=======

View.prototype.addNewArticle = function (article, callback1 = ()=>{}, callback2 = ()=>{}, rowClickListener = ()=>{}) {
    var tableBody = this.common.select("table > tbody");
    if ( tableBody ) {
        var newRow = tableBody.insertRow(0);
        var newCell = newRow.insertCell(0);
        newCell.innerText = article.number;
        newCell = newRow.insertCell(1);
        newCell.innerText = article.subject;
        newCell = newRow.insertCell(2);
        newCell.dataset.id = article.writerId;
        newCell.innerText = article.writer;
        newCell = newRow.insertCell(3);
        newCell.innerText = article.read;


            callback1();

            callback2();



            rowClickListener(newRow);

    }
};

View.prototype.addReverseNewArticle = function(article, callback1 = ()=>{}, callback2 = ()=>{}, rowClickListener = ()=>{}) {
    var tableBody = this.common.select("table > tbody");
    if ( tableBody  ) {
        var newRow = tableBody.insertRow(tableBody.rows.length);
        var newCell = newRow.insertCell(0);
        newCell.innerText = article.number;
        newCell = newRow.insertCell(1);
        newCell.innerText = article.subject;
        newCell = newRow.insertCell(2);
        newCell.dataset.id = article.writerId;
        newCell.innerText = article.writer;
        newCell = newRow.insertCell(3);
        newCell.innerText = article.read;


            callback1();

            callback2();



            rowClickListener(newRow);

    }
};

View.prototype.removeDetailRows = function (tbody) {
    for ( var index in tbody.rows ) {
        if ( tbody.rows[index].className == "detail" ) {
            tbody.deleteRow(index);
        }
    }
};

>>>>>>> develop
View.prototype.addDetailView = function(tbody, rowIndex, content) {
    var detailRow = tbody.insertRow(rowIndex);
    detailRow.className = "detail";
    var detailCell = detailRow.insertCell(0);
    detailCell.colSpan = 4;
    detailCell.style.paddingLeft = "40px";
    detailCell.innerHTML = content;
};

View.prototype.removeAllArticles = function () {
  // table > tbody 검색 후
  const tbody = this.common.select("table > tbody");
<<<<<<< HEAD
  // table > tbody > tr 을 모두 삭제
  const rows = this.common.selectAll("tr", tbody);

  rows.forEach(function (row) {
    row.remove();
  });


=======
  // table > tbody > tr 을 모두
  });

sdfsdf
>>>>>>> develop

};


window.app = window.app || {};
window.app.View = View;
