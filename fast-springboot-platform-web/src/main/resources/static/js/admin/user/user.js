var $;
layui.use(['jquery', 'table', 'form'], function() {
    $ = layui.jquery;

    $("#addUser").click(function () {
        top.layer.open({
            type: 2,
            area: ['45%', '90%'],
            content: ctxPath + '/admin/user/toSaveUI'
        });
    })
})