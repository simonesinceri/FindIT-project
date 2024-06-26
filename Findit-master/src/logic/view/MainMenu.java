package logic.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import logic.controller.EventsController;
import logic.controller.HomeController;
import logic.controller.HotelController;
import logic.controller.ProfileController;
import logic.controller.MapController;
import logic.controller.RestaurantsController;

public class MainMenu extends HBox{
	
	protected Button buttonFindit;
    protected HBox baseScene;
    protected HBox baseHBox;
    protected Button buttonHotel;
    protected Button buttonRestaurants;
    protected Button buttonEvents;
    protected Button buttonMap;
    protected Button buttonProfile;
    
    protected HomeScene homeScene;
    protected HotelScene hotelScene;
    protected RestaurantsScene restaurantsScene;
    protected EventsScene eventsScene;
    protected ProfileScene profileScene;
    
    public MainMenu(AnchorPane scenePane,
			HomeController homeController,
			HotelController hotelController,
			RestaurantsController restaurantsController,
			EventsController eventsController,
			MapController mapController,
			ProfileController profileController){
		
		buttonFindit = new Button();
        baseHBox = new HBox();
        buttonHotel = new Button();
        buttonRestaurants = new Button();
        buttonEvents = new Button();
        buttonMap = new Button();
        buttonProfile = new Button();
    	
    	buttonFindit.setLayoutX(0.0);
    	buttonFindit.setLayoutY(0.0);
    	buttonFindit.setMnemonicParsing(false);
    	buttonFindit.setPrefHeight(82.0);
    	buttonFindit.setPrefWidth(215.0);
    	buttonFindit.setMinWidth(215.0);
    	buttonFindit.setText("FindIT");
    	
    	String selected = "b_selected";
    	String menu = "b_menu";
    	
    	buttonFindit.setOnMouseEntered(evt -> buttonFindit.setUnderline(true));
    	buttonFindit.setOnMouseExited(evt -> buttonFindit.setUnderline(false));
    	
    	buttonFindit.setFont(new Font(72.0));
        buttonFindit.setPadding(new Insets(0.0, 0.0, 0.0, 0.0));
        HBox.setMargin(buttonFindit, new Insets(25.0, 0.0, 20.0, 0.0));
        
        setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        setLayoutX(0.0);
        setLayoutY(0.0);
        setPrefHeight(145.0);
        setPrefWidth(1015.0);
        
        baseHBox.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        baseHBox.setLayoutX(0.0);
        baseHBox.setLayoutY(0.0);
        baseHBox.setPrefHeight(145.0);
        baseHBox.setPrefWidth(764.0);
        
        buttonHotel.setMnemonicParsing(false);
        buttonHotel.setText("Hotels");
        buttonHotel.setTextFill(javafx.scene.paint.Color.WHITE);
    	
        buttonHotel.setOnMouseEntered(evt -> buttonHotel.setUnderline(true));
        buttonHotel.setOnMouseExited(evt -> buttonHotel.setUnderline(false));
    	
        buttonHotel.setFont(new Font(24.0));
        
        buttonRestaurants.setMnemonicParsing(false);
        buttonRestaurants.setText("Restaurants");
        buttonRestaurants.setTextFill(javafx.scene.paint.Color.WHITE);
    	
        buttonRestaurants.setOnMouseEntered(evt -> buttonRestaurants.setUnderline(true));
        buttonRestaurants.setOnMouseExited(evt -> buttonRestaurants.setUnderline(false));
    	
        buttonRestaurants.setFont(new Font(24.0));

        buttonEvents.setMnemonicParsing(false);
        buttonEvents.setText("Events");
        buttonEvents.setTextFill(javafx.scene.paint.Color.WHITE);
    	
        buttonEvents.setOnMouseEntered(evt -> buttonEvents.setUnderline(true));
        buttonEvents.setOnMouseExited(evt -> buttonEvents.setUnderline(false));
    	
        buttonEvents.setFont(new Font(24.0));

        buttonMap.setMnemonicParsing(false);
        buttonMap.setText("Map");
        buttonMap.setTextFill(javafx.scene.paint.Color.WHITE);
    	
        buttonMap.setOnMouseEntered(evt -> buttonMap.setUnderline(true));
        buttonMap.setOnMouseExited(evt -> buttonMap.setUnderline(false));
    	
        buttonMap.setFont(new Font(24.0));

        buttonProfile.setMnemonicParsing(false);
        buttonProfile.setText("Profile");
        buttonProfile.setTextFill(javafx.scene.paint.Color.WHITE);
    	
        buttonProfile.setOnMouseEntered(evt -> buttonProfile.setUnderline(true));
        buttonProfile.setOnMouseExited(evt -> buttonProfile.setUnderline(false));
    	
        buttonProfile.setFont(new Font(24.0));
        
        buttonFindit.setId(selected);
        buttonHotel.setId(menu);
        buttonRestaurants.setId(menu);
        buttonEvents.setId(menu);
        buttonMap.setId(menu);
        buttonProfile.setId(menu);
        
        buttonFindit.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
				buttonFindit.setId(selected);
		        buttonHotel.setId(menu);
		        buttonRestaurants.setId(menu);
		        buttonEvents.setId(menu);
		        buttonMap.setId(menu);
		        buttonProfile.setId(menu);
		        
				homeController.changeScene(scenePane);
			}
		});
        
        buttonHotel.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
				buttonFindit.setId(menu);
		        buttonHotel.setId(selected);
		        buttonRestaurants.setId(menu);
		        buttonEvents.setId(menu);
		        buttonMap.setId(menu);
		        buttonProfile.setId(menu);

				hotelController.changeScene();
			}
		});
        
        buttonRestaurants.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
				buttonFindit.setId(menu);
		        buttonHotel.setId(menu);
		        buttonRestaurants.setId(selected);
		        buttonEvents.setId(menu);
		        buttonMap.setId(menu);
		        buttonProfile.setId(menu);
		        
				restaurantsController.changeScene();
			}
		});
        
        buttonEvents.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
				buttonFindit.setId(menu);
		        buttonHotel.setId(menu);
		        buttonRestaurants.setId(menu);
		        buttonEvents.setId(selected);
		        buttonMap.setId(menu);
		        buttonProfile.setId(menu);
		        
				eventsController.changeScene();
			}
		});
        
        buttonMap.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
				buttonFindit.setId(menu);
		        buttonHotel.setId(menu);
		        buttonRestaurants.setId(menu);
		        buttonEvents.setId(menu);
		        buttonMap.setId(selected);
		        buttonProfile.setId(menu);
		        
				mapController.changeScene(scenePane);
			}
		});
        
        buttonProfile.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
				buttonFindit.setId(menu);
		        buttonHotel.setId(menu);
		        buttonRestaurants.setId(menu);
		        buttonEvents.setId(menu);
		        buttonMap.setId(menu);
		        buttonProfile.setId(selected);
		        
				profileController.changeScene();
			}
		});
        
        getChildren().add(buttonFindit);
        getChildren().add(baseHBox);
        baseHBox.getChildren().add(buttonHotel);
        baseHBox.getChildren().add(buttonRestaurants);
        baseHBox.getChildren().add(buttonEvents);
        baseHBox.getChildren().add(buttonMap);
        baseHBox.getChildren().add(buttonProfile);
        scenePane.getChildren().add(this);
	}
    
}
