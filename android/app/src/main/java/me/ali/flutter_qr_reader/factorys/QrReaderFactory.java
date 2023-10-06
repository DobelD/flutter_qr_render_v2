package me.ali.flutter_qr_reader.factorys;

import android.content.Context;

import java.util.Map;

import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import me.ali.flutter_qr_reader.views.QrReaderView;
import io.flutter.plugin.common.BinaryMessenger;

public class QrReaderFactory extends PlatformViewFactory {
    BinaryMessenger messenger;

    public QrReaderFactory(BinaryMessenger messenger) {
        super(StandardMessageCodec.INSTANCE);
        this.messenger = messenger;
    }

    @Override
    public PlatformView create(Context context, int id, Object args) {
        Map<String, Object> params = (Map<String, Object>) args;
        return new QrReaderView(context,this.messenger, id, params);
    }
}
