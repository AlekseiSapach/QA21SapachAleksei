package models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Project {
    @SerializedName(value = "name")
    private String projectName;
    @SerializedName(value = "announcement")
    private String Announcement;
    @SerializedName(value = "suite_mode")
    private int ProjectType;
    @SerializedName(value = "show_announcement")
    private boolean Flag;

}
