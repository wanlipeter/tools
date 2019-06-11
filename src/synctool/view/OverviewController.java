package synctool.view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import synctool.model.CopyService;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by wanli on 2019/6/4.
 */
public class OverviewController implements Initializable {
    @FXML
    private Button FindLog;

    @FXML
    private Label MyNotification;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // TODO (don't really need to do anything here).

    }

    //函数入参的时间类型和fxml要能对应起来
    public void showDateTime(MouseEvent event) {
        //调用model中的提取方法
        CopyService.copylog();
        CopyService.copydata();
        MyNotification.setText("已提取到桌面哟,就在Fangcloud_log文件夹中");

    }


}
