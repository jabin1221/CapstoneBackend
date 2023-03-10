package WebCapstone.WebCapstone.DTO;


import lombok.*;

@Data
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ChatDTO {

    //private String chatRoomId;
    private String senduser;
    private String receiveuser;
    private String chattitle;
    private String message;
    private String date;

    @Builder
    public ChatDTO(String senduser, String receiveuser, String chattitle, String message, String date){
        this.senduser = senduser;
        this.receiveuser = receiveuser;
        this.chattitle = chattitle;
        this.message = message;
        this.date = date;
    }





}


