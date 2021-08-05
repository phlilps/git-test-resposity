// 删除用户
function delUser(modUleId) {
    $.ajax({
        type: "GET",//请求方式
        url: "../Site/del",//访问请求路径
        data: {modUleId: modUleId},//数据传递
        dataType: 'json',//数据响应返回类型
        success: function (result) {//成功回调函数
            if (result == 1) {
                $('#findAll').triggerHandler('click');
                // alert("删除成功")
            } else {
                alert("删除失败")
            }
        },
        error: function () {//失败回调函数
            alert("删除失败！")
        }
    });
}



$(function () {
    var data = {
        // 声明页数字
        pageIndex: null,
        // 声明输入框
        userName: null
    };
    $("#findAll").click(function () {
        // 调用select()查询方法
        select()
    })
    // 键盘回车键事件
    $(document).keydown(function (event) {
        if (event.keyCode == 13) {
            $('#findByUserName').triggerHandler('click');
            // 获取输入框的值
            var userName = $("#findByUserName").val()
            data.userName = userName
            // $('#findAll').triggerHandler('click');方法是刷新网站防止延迟
            $('#findAll').triggerHandler('click');
        }
    });
    $('#findByUserName').blur(
        function () {
            data.userName = null;
            $("#findByUserName").val(null)
            // $('#findAll').triggerHandler('click');方法是刷新网站防止延迟
            $('#findAll').triggerHandler('click');
        }
    )
    // 选择首页
    $("#Pagination a").eq(0).click(function () {
        select("homePage")
    })
    // 选择上一页
    $("#Pagination a").eq(1).click(function () {
        select("previouspage")
    })
    // 选择下一页
    $("#Pagination a").eq(2).click(function () {
        select("nextPage")
    })
    // 选择最后页
    $("#Pagination a").eq(3).click(function () {
        select("trailerPage")
    })
    // 登录功能
    // console.log(data.pageIndex)
    function select(page) {
        $.ajax({
            type: "post",//请求方式
            url: "../Site/findAll",//访问请求路径
            data: data,//数据传递
            //数据响应返回类型
            success: function (result) {//成功回调函数
                console.log(result)
                if (page != null) {
                    if (page == "homePage") {
                        data.pageIndex = null;
                        // console.log("首页")
                    }
                    if (page == "previouspage") {
                        // 当上一页等于0返回最后面一页否则继续下一页
                        if (result[1].prePage == 0) {
                            data.pageIndex = result[1].pages
                        } else {
                            data.pageIndex = result[1].prePage
                        }
                        // console.log(result[1].prePage+"上一页")
                    }
                    if (page == "nextPage") {
                        // 当下一页等于0返回首页面一页否则继续下一页
                        if (result[1].nextPage == 0) {
                            data.pageIndex = null
                        } else {
                            data.pageIndex = result[1].nextPage
                        }
                        // console.log(result[1].nextPage+"下一页")
                    }
                    if (page == "trailerPage") {
                        data.pageIndex = result[1].pages
                        // console.log(result[1].pages+"最后一页")
                    }
                    // select()方法是刷新网站防止延迟
                    select();
                }
                // console.log(result[1]);
                var html = "";
                for (var i = 0; i < result[0].length; i++) {
                    var ServerObject=result[0][i]
                    var   user=ServerObject.user==undefined?"null":ServerObject.user
                    html += "<tr>" +
                        '<td><input name="ids" type="checkbox"></td>' +
                        "<td>" + ServerObject.id + "</td>" +
                        "<td>" + ServerObject.contact + "</td>" +
                        "<td>" + ServerObject.siteDesc + "</td>" +
                        "<td>" + ServerObject.postCode + "</td>" +
                        "<td>" + ServerObject.telPhoneNum + "</td>" +
                        "<td>" + user.username + "</td>" +
                        '<td class="text-center"> ' +
                        '<a href="javascript:void(0);" onclick="delUser(\'' +ServerObject.id + '\')" class="btn bg-olive btn-xs">删除</a> ' +
                        '<a href="../Site/return?id=' + ServerObject.id + '"  class="btn bg-olive btn-xs">修改</a> </td>'
                        + "</tr>"
                    // onclick="update(\'' + result[0][i].id + '\')"
                }
                // 清空网页防止遗留
                $("#tbody").html("");
                $("#tbody").html(html);
            },
            error: function () {//失败回调函数
                alert("查询失败！")
            }
        });
    }

    // $('#findAll').triggerHandler('click');方法是刷新网站防止延迟
    $('#findAll').triggerHandler('click');


})