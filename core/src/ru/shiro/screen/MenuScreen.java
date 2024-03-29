package ru.shiro.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import ru.shiro.base.BaseScreen;

public class MenuScreen extends BaseScreen {

    private static final float spe = 0.01f;

    private Texture img;
    private Vector2 pos;
    private Vector2 v;
    private Vector2 pos2;

    @Override
    public void show() {
        super.show();
        img = new Texture("images.jpg");
        pos = new Vector2();
        pos2 = new Vector2();
        v = new Vector2();

    }
    @Override
    public void render(float delta) {
        super.render(delta);
        batch.begin();
        batch.draw(img, pos.x, pos.y);
        batch.end();
        if(pos2.dst(pos) > spe){
            pos.add(v);
        }else{
            pos.set(pos2);
        }

    }

    @Override
    public void dispose() {
       super.dispose();
        img.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        pos2.set(screenX, Gdx.graphics.getHeight() - screenY);
        v.set(pos2.cpy().sub(pos));
        v.scl(spe);
        return super.touchDown(screenX, screenY, pointer, button);
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        pos.set(screenX, Gdx.graphics.getHeight() - screenY);
        return super.touchDragged(screenX, screenY, pointer);
    }
}
