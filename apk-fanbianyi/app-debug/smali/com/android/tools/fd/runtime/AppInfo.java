package com.android.tools.fd.runtime; class AppInfo {/*

.class public Lcom/android/tools/fd/runtime/AppInfo;
.super Ljava/lang/Object;


# static fields
.field public static applicationClass:Ljava/lang/String;

.field public static applicationId:Ljava/lang/String;

.field public static token:J

.field public static usingApkSplits:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string/jumbo v0, "com.beecloud.control.engine"

    #v0=(Reference);
    sput-object v0, Lcom/android/tools/fd/runtime/AppInfo;->applicationId:Ljava/lang/String;

    const/4 v0, 0x0

    #v0=(Null);
    sput-object v0, Lcom/android/tools/fd/runtime/AppInfo;->applicationClass:Ljava/lang/String;

    const-wide v0, -0x79ee84c9ab5edf90L

    #v0=(LongLo);v1=(LongHi);
    sput-wide v0, Lcom/android/tools/fd/runtime/AppInfo;->token:J

    const/4 v0, 0x0

    #v0=(Null);
    sput-boolean v0, Lcom/android/tools/fd/runtime/AppInfo;->usingApkSplits:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

*/}
