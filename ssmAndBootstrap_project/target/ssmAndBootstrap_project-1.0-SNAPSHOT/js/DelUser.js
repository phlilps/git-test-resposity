// 删除用户
function delUser(userId) {
    $.ajax({
        type: "GET",//请求方式
        url: "../user/del",//访问请求路径
        data: {userld: userId},//数据传递
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