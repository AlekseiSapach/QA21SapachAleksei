package models;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Milestone {
    @SerializedName(value = "name")
    private String milestoneName;
    @SerializedName(value = "description")
    private String milestoneDesc;

}
